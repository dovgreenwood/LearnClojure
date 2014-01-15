;; ordinarily, when something is put into parentheses, many errors can be thrown (like putting numbers in can throw a ...clojure.lang.IFn)
;; to fix this, you can use quote, or ' to pass everything that is inside as a collection without evaluating it
(cons 1 '(2 3))
;; this passes a sequence -- (2 3) -- to the cons, rather than trying to make the int into a func

;; one can unquote so that something is evaluated as well
(cons 1 '(2 (+ 1 2)))
;;the above will evaluate to (1 2 (+ 1 2)), while the below will evaluate to (1 2 3)
;; note that above I use a ' and below a `, te difference is that the second can un-quote and has slightly more featuers
(cons 1 `(2 ~(+ 1 2)))
