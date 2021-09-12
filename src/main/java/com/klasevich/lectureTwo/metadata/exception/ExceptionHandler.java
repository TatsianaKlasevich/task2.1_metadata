package com.klasevich.lectureTwo.metadata.exception;

public class ExceptionHandler {

    public void execute() {
        ExceptionProducer exceptionProducer = new ExceptionProducer();
        catchOutOfMemoryErrorMetaspace(exceptionProducer);
    }

    public void catchOutOfMemoryErrorMetaspace(ExceptionProducer exceptionProducer) {
        exceptionProducer.produceOutOfMemoryErrorMetaspace();
    }
}
