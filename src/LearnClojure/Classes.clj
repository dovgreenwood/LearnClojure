;; classes can be instanced with a "."
;; "new java.awt.Point: is "java.awt.Point."
(println (java.awt.Point. 10 10)) ;;=> 	#<Point java.awt.Point[x=10,y=10]>
;; calling members of a class can be easily done using ".."
;; "(.x (java.awt.Point. 10 10))" is "((java.awt.Point 10 10) x)"
(println (.. (java.util.Date.) toString))
;; clojure also has a function called doto for classes, which literally does what is inside the block to the class
(println (doto (java.util.ArrayList.)
           (.add "Hello")
           (.add "I")
           (.add "am")
           (.add "Dov")
          ))

