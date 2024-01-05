public class JavaCaller {
    public static void main(String[] args) {
        accessToInternalMember();
        System.out.println();
        accessToInternalClass();
    }

    private static void accessToInternalMember(){
        MemberInternal memberInternal = new MemberInternal();
//        System.out.println(memberInternal.getInternalField$callee()); // ERROR Usage of Kotlin internal declaration from different module
//        memberInternal.internalMethod$callee(); // ERROR Usage of Kotlin internal declaration from different module
    }

    private static void accessToInternalClass(){
//        ClassInternal classInternal = new ClassInternal(); // ERROR Usage of Kotlin internal declaration from different module
//        System.out.println(classInternal.getInternalField$callee()); // ERROR Usage of Kotlin internal declaration from different module
//        classInternal.internalMethod$callee(); // ERROR Usage of Kotlin internal declaration from different module
    }
}
