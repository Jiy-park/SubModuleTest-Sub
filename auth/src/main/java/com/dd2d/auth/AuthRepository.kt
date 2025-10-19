package com.dd2d.auth

@Deprecated(
  message = "use AuthRepository2",
  replaceWith = ReplaceWith("AuthRepository2", "package com.dd2d.auth.AuthRepository2"),
  level = DeprecationLevel.WARNING
)
interface AuthRepository {
  fun signIn()
  fun signUp()
}