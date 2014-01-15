(let [r  5
      pi  3.14
      r-squared  (* r r)]
  (println "circle area: " (* pi r-squared))
  )
;; evidently, local variables are only available within their declaration parentheses
;;per the documentation, it seems that locals are constant

(def answer 42)
(def answer "forty-two")
(println "the answer to life, the universe, and everything is" answer)
;;whereas with vars, they are available anywhere
;;it seems like to change the value, it has to be rebound
