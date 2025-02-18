```groovy
class MyClass {
    def myMethod(String str) {
        if (str == null) {
            return "Null String"
        }
        return str.toUpperCase()
    }
}

assert new MyClass().myMethod(null) == "Null String"
assert new MyClass().myMethod("hello") == "HELLO"

//The following assertion will fail. The reason for this is that Groovy's == operator performs a type-safe comparison, even for Strings. 
//Although the value is the same the type is not the same so it's false.
assert new MyClass().myMethod("hello") == "hello" //Fails
```