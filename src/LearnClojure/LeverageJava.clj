;; java methods can be imported via namespace
(println(Math/sqrt 9))
;; java classes can also be accessed easily
(println (.x (new java.awt.Point 10 20)))
;; properties can be set with "set!"
(let [origin  (new java.awt.Point 0 0)]
  (set! (.x origin) 5)
  (println (.x origin) "," (.y origin))
  )
