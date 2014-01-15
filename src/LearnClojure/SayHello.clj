(defn say-hello
  ([x] (println x " says hello."))
  ([x y] (println x "and" y "say hello."))
  ([x y & z]
   (print x "," y ",")
   (dotimes [i (count z)]
     (if (not= i (- (count z) 1))
       (print (nth z i) ",")
       (println "and" (last z) "say hello.")
       )
     )
   )
  )

(defn say-hello-improved
  [& z] (case (count z)
          1 (println (first z) "says hello.")
          2 (println (first z) "and" (last z) "say hello.")
          (dotimes [i (count z)]
              (if (not= i (- (count z) 1))
                (print (nth z i) ",")
                (println "and" (last z) "say hello.")
               )
              )
         )
  )

(say-hello-improved "Matt" "Pam" "Liat" "Dov" "Sefi" "Sarit")
