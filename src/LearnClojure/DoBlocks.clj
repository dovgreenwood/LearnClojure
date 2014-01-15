[1 2 3]
(+ 1 2)
;; ordinarily, each mini code block will automatically return
;; if you only want, say, one value to be returned, use the "do" block
(do
  [1 2 3]
  (+ 1 2)
  )
;;this block will only return the value '3' because it is in the tail-position of the "do" block
