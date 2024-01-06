package inaction.chap4.otherpkg

import inaction.chap4.sealed.CustomError

class ExtendIndirectSubClass : CustomError() {

}

// 같은 패키지로 옮겨야 함.
//class ExtendDirectSubClass : IOError() {}