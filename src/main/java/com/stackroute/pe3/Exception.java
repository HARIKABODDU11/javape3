package com.stackroute.pe3;

public class Exception extends Throwable {
        public static String arrayhandling(int size, int[] array,Exception e) { // this method will shows all type of exceptions
            String str = "";
            try {
                if (size < 0) throw new NegativeArraySizeException();
                if (size != array.length) throw new IndexOutOfBoundsException();
                if (e == null) throw new NullPointerException();
            } catch (NegativeArraySizeException exception) {
                str = "This is NegativeArraySizeException";
            } catch (IndexOutOfBoundsException exception) {
                str = "This is IndexOutOfBoundsException";
            } catch (NullPointerException exception) {
                str = "This is NullPointerException";
            }
            return str;
        }
    }

