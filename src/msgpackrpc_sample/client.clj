(ns msgpackrpc-sample.ifaces)

(gen-interface
  :name IMath
  :methods [[add [int int] int]
            [sub [int int] int]
            [mul [int int] int]
            [div [int int] double]])

(ns msgpackrpc-sample.client
  (:import IMath)
  (:import [org.msgpack.rpc.loop EventLoop])
  (:import [org.msgpack.rpc Client]))

(defn -main
  "Starts a MessagePack-RPC based client"
  [& args]
  (let [loop (EventLoop/defaultEventLoop)]
    (let [cli (Client. "localhost" 1978 loop)]
      (let [iface (.proxy cli IMath)]
        (println "10 + 2 =" (.add iface 10 2))
        (println "10 - 2 =" (.sub iface 10 2))
        (println "10 * 2 =" (.mul iface 10 2))
        (println "10 / 2 =" (.div iface 10 2))))))
