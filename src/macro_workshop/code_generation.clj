(ns macro-workshop.code-generation)


(defn generate-addition [a b]
  (list '+ a b)  )

(defn generate-multiplication [a b]
  `(* ~a ~b)
  )

(defn generate-squarer []
   `#(* % %)
  )

(defn generate-hello-world-definition []
  `(fn [ ] (println "Hello World!" ))

  )
