;; exceptions can be created and thrown much the same as in java
(throw (Exception. "I am Error."))
;; catching is also simple
(try
  (1)
  (catch Exception e (println "Fail."))
  )