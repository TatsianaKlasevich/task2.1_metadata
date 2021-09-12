package com.klasevich.lectureTwo.metadata.exception;

import javassist.CannotCompileException;
import javassist.ClassPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionProducer {
    public static final Logger logger = LogManager.getLogger();
    public static ClassPool classPool = ClassPool.getDefault();

    public void produceOutOfMemoryErrorMetaspace() {
        for (int i = 0; ; i++) {
            try {
                Class newClass = classPool.makeClass("OutOfMemoryErrorNewClass" + i).toClass();
                System.out.println(newClass.getName());
            } catch (CannotCompileException e) {
                logger.error(e);
            }
        }
    }
}
