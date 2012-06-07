# msgpackrpc-sample

This is a sample of MessagePack-RPC client/server built in Clojure powered by the Java implementation.

### MessagePack

    http://wiki.msgpack.org/display/MSGPACK/Home
    http://wiki.msgpack.org/display/MSGPACK/QuickStart+for+Java

## Usage

    $ git clone https://github.com/leandrosilva/msgpackrpc-sample-clojure
    $ cd msgpackrpc-sample-clojure
    $ lein compile :all
    $ lein run -m msgpackrpc-sample.server    # at terminal 1
    $ lein run -m msgpackrpc-sample.client    # at terminal 2

## What else?

I have also a sample of a Java client talking to the Clojure server.

    https://gist.github.com/2887043

## License

Copyright © 2012 Leandro Silva (CødeZøne)

Distributed under the Eclipse Public License, the same as Clojure.
