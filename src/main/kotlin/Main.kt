//import kotlin.math.log

fun main() {
//  loginAPI("Derry", "123456"){ msg: String, code: Int ->
//   println("最终登录的情况: msg: $msg, code: $code")
//
//  }
  //  loginAPI("Derry", "123456", ::methodResponseResult)

//    val niMin_showMethod = showMethod("show")
//    println(niMin_showMethod("Derry", 33))
    val str = "李元霸"

    val r1  =  with(str, ::getStrLen)
    println(r1)
}
fun getStrLen(str:String) = str.length
//fun showMethod(info: String) :(String, Int)-> String {
//    println("我是show函数info : $info")
//
//    return { name: String , age: Int ->
//        "我是匿名函数:我的名字是$name ,age:$age"
//
//    }
//}
//fun methodResponseResult(msg: String, code: Int) {
//    println("最终登录的情况: msg: $msg, code: $code")
//}
//
//const val USER_NAME_SAVE_DB = "Derry"
//const val USER_PWD_SAVE_DB = "123456"

 //inline fun loginAPI(username: String, useradd: String, responseResult: (String, Int) -> Unit){

//     if (USER_NAME_SAVE_DB == username && USER_PWD_SAVE_DB == useradd){
//         responseResult("login success", 200)
//     }else{
//         responseResult("login error", 444)
//     }


//   if (username == null || useradd == null){
//    TODO("用户名或密码为空！")
//   }
//
//   if (username.length >3 && useradd.length>3){
//    if (webServerLoginAPI(username , useradd )){
//     responseResult("login success", 200)
//    }else{
//     responseResult("login error", 444)
//    }
//   }else{
//    TODO("用户名或密码不合格！")
//   }
//}

//登录的API暴露者 服务器
// fun webServerLoginAPI(name: String,pwd: String): Boolean{
// return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
//}