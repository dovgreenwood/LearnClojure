;; namespace is clojure's word for package
;; it is represented by "ns"
;; variables declared in one namespace are unavailable in another
(ns contains-hello-fn)
(defn hello [x] (println "Hello" x))
(hello "Dov")

(ns does-not)
(hello "Dov") ;;error, fn does not exist

(ns contains-hello-fn)
(hello "Matt")


;;namespaces can be imported using :require (essentially: package.subpackage)
;; they can be renamed with :as
(ns does-not
  (:require [contains-hello-fn :as h]))
(h/hello "Pam") ;;also could have been contains-hello-fn/hello instead

;; :use is used to import directly. i.e: all of the namespace member can be accessed directly (essentially: package.subpackage.*)
;; :only is used to import only certain things.  USE - (:use [package :only [items]]) (essentially: package.subpackage.item)
(ns other
  (:use contains-hello-fn))
(hello "Mulan")