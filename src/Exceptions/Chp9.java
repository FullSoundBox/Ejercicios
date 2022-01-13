package Exceptions;

/**
 * This class gives examples of Exceptions handling, based on chapter 9 of
 * the book Object-Oriented Programming using Java. Below are some examples and exercises
 * on the creation of exception classes, methods and objects.
 */
/*public class Chp9 {
    static class TransmissionError extends Exception(){
        int errorKind;
        TransmissionError() { errorKind = 0;}
        TransmissionError(int x){errorKind = x;}
        String toString(){
            return("Transmission error: " + errorKind);
        }
    }
}*/
/*class EmptyStack extends Exception(){ }*/
/*class FullStack extends Exception(){ }*/

    /*
class Stack(){
    int height;
    Object items[];
    void push(Object x) throws FullStack{
        if(items.length == height){
            throw new FullStack();
            items[height++] = x;
        }
    }
    Object pop() throws EmptyStack{
        if(height==0){
            throw new EmptyStack();
            return(items[--height]);
        }
    }
    void init(int s){
        height = 0;
        item = new Object[s];
    }
    Stack(int s) {init(s);}
    Stack() {init(10);}
}

/**
 * Example of exception handling using an EMail Class. exceptions may occur when xyz.com is not a valid email host,
 * happy is not a legitimate user on the host, or premature closure of the socket connection. This is a rundimentary
 * way of handling errors.
 */
/*class EMail(){
    void send(String adress){
        errorCode = 0;
        makeHostConnection(emailHostOf(adress));
        if (connectionError){
            errorMessage("host does not exists");
            errorCode = 1;
        }
        else{
            verifyUser(emailUserOf(adress));
            if(noUserReply){
                errorMessage("user is not valid");
                errorCode = 2;
            }
        }
        else{
            while((!endofInputBuffer()) && errorCode != 1){
                line = readInputBuffer();
                sendContent(line)
            }
            if(networkError){
                errorMessage("connection error ocurred");
                errorCode = 3;
            }
        }
    }
}*/

/**
 * Using try and catch we can sepparate normal program logic from error handling code. It looks more comprehensible
 * and we can add multiple exceptions without modifying the original code.
 */
/*class EMail {
...
    void send(String address) {
        try {
            errorCode = 0;
            makeHostConnection(emailHostOf(address));
            verifyUser(emailUserof(address));
            while (!endofInputBuffer()) {
                line = readInputBuffer();
                sendContent(line);
            }
        } catch (SocketException s) {
            errorMessage("host does not exist");
            errorCode = 1;
        } catch (NoUserReply n) {
            errorMessage("user is not valid");
            errorCode = 2;
        } catch (WriteError) {
            errorMessage("connection error occurred")
            errorCode = 3;
        }
    }
...
}*/


