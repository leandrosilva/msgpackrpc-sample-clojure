(ns msgpackrpc-sample.server
  (:import [org.msgpack.rpc.loop EventLoop])
  (:import [org.msgpack.rpc Server]))

(gen-class
  :name MathServer
  :methods [[add [int int] int]
            [sub [int int] int]
            [mul [int int] int]
            [div [int int] double]])

(defn -add [this a b]
  (+ a b))

(defn -sub [this a b]
  (- a b))

(defn -mul [this a b]
  (* a b))

(defn -div [this a b]
  (/ a b))

(defn -main
  "Starts a MessagePack-RPC based server"
  [& args]
  (let [loop (EventLoop/defaultEventLoop)]
    (let [svr (Server.)]
      (.serve svr (MathServer.))
      (.listen svr 1978))
      (println "MathServer running and listening on 1978")
    (.join loop)))
