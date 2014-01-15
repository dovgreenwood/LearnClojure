;; summing the numbers 0 - 10 (exclusive) forcibly
(def sum 0)
(dotimes [i 10]
  (def sum (+ sum i))
  )
(println sum)
;; this is an example of a for loop.  it defines 'i' as a local which loops through the values 0 - X (which is a user define val).

(defn count-down [top]
  (println "starting...") ;;this is a problem...it will print "starting..." 10 times!
  (when(pos? top) ;; when the value is positive (WARNING: 0 is not considered positive)
    (println top)
    (recur (dec top))
    )
  )
(count-down 10)
;; recur returns to the top of the functional block that it is in, and performs the operations inside its own block

(defn count-up-targeting [top]
  (println "starting...") ;; Yay! Because of loop, it only prints this once!
  (loop [x  top]
    (when (pos? x)
      (println x)
      (recur (dec x))
      )
    )
  )
(count-up-targeting 10)
;; loop [vec] provides a target for recur to jump back to, with a vector containing locals for the new "functional block"
