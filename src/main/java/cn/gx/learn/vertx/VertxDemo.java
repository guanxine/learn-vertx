package cn.gx.learn.vertx;

import io.vertx.core.Vertx;

/**
 * Created by guanxine on 17-9-15.
 */
public class VertxDemo {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.createHttpServer()
                .requestHandler(request -> {
                    request.response().end("hello Vert.x\n");
                })
                .listen(8080);

    }
}
