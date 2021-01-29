// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nickwhite/Development/Github/circle-ci-testing/conf/routes
// @DATE:Fri Jan 29 14:03:19 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
