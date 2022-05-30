(ns macro-workshop.fancy-quoting)

(defn math-operations-set []
 `#{* + - /}
  )
(defrecord None [])
(defrecord Some [value] )

;; Hint: you actually don't need to define any more vars to get this solved
(defmacro construct-maybe
  ([] `(None. ))
  ([x] `(Some. "hi")))

