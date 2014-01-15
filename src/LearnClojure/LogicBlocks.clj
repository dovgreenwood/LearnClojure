(defn stupid-fn-bools [bool]
  (if bool
    (println "your bool was true")
    (println "your bool was false")
    )
  )
(stupid-fn-bools true)
;; "if" blocks accept a value that evaluates to true or false, and two blocks: the first is executed if true, the second if false

(defn stupid-fn-nums [num]
  (case num
    1 (println "it was 1")
    2 (println "it was 2")
    3 (println "it was 3")
    (println "it was not 1, 2, or 3")
    )
  )
(stupid-fn-nums 4)
;; case blocks accept a parameter to check, and possible cases followed by a statement-block.  The default statement has no case.
