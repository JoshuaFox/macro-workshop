(ns macro-workshop.code-generation)


(defn generate-addition [a b]
  (list '+ a b)  )

(defn generate-multiplication [a b]
  `(* ~a ~b)
  )

(defn generate-squarer []

  (list 'fn (vector 'x) (list '* 'x 'x))   )

(defn generate-hello-world-definition []

  (list `fn (vector) (list 'println "Hello World!"))  )
