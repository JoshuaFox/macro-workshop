(ns macro-workshop.exercise-macros)

(defmacro if-nonempty-let
  "Like if-let, but treats any empty collection (as via `empty?`) as false"
  [bindings then else]

  `(do
     (when (not (seqable? ~bindings))
       (throw (AssertionError. "if-nonempty-let requires bound values to be seqable")))
     (when (not (= 2 (count ~bindings)))
       (throw (AssertionError. "if-nonempty-let requires a name/value vector binding")))
     (if (not (empty? ~(second bindings)))
       (let [~(first bindings) ~(second bindings)]
         ~then)
       ~else)))
;(if-nonempty-let 222222 1 2)
;
(macroexpand-1 `(if-nonempty-let [xs (range 4)]
                                 [:non-empty xs]
                                 :empty))

