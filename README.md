# msgpackrpc-sample

This is a sample of a MessagePack-RPC client/server application built in Clojure and powered by the Java implementation of MessagePack-RPC. Really simple, but enough to try that stuff.

### MessagePack

* [The MessagePack Project](http://msgpack.org)
* [MessagePack Wiki](http://wiki.msgpack.org/display/MSGPACK/Home)
* [QuickStart for Java](http://wiki.msgpack.org/display/MSGPACK/QuickStart+for+Java)

## Usage

    $ git clone https://github.com/leandrosilva/msgpackrpc-sample-clojure
    $ cd msgpackrpc-sample-clojure
    $ lein compile :all
    $ lein run -m msgpackrpc-sample.server    # at terminal 1
    $ lein run -m msgpackrpc-sample.client    # at terminal 2

## What else?

I have also a sample of a Java client talking to the Clojure server.

* [https://gist.github.com/2887043](https://gist.github.com/2887043)

## License

Copyright © 2012 Leandro Silva (CødeZøne)

Distributed under the Eclipse Public License, the same as Clojure.
