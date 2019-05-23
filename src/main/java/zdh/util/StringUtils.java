package zdh.util;




    public class StringUtils {


        // 判断字符串是不是空的
        // 这种效率最高,使用的时间是最短的

        public static boolean isEqualNULL(String str){


            if(str == null || str.length() == 0 ){


                return true;
            }

            return false;

        }

        // 判断对象是不是空
        public static boolean isNULL(Object object){

            if(object == null){

                return true;
            }


            return false;
        }
    }


