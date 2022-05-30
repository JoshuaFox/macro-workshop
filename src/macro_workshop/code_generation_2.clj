(ns macro-workshop.code-generation-2)

;; you ought to be able to reuse your macro-workshop.code-generation solutions
;; for this - it's almost a literal copy-paste of the function body to the
;; macro body!

(defmacro add [x y]
  (list '+ x y)   )

(defmacro multiply [x y]
  (list '* x y ))

(defmacro make-squarer []

  (list 'fn (vector 'x) (list '* 'x 'x))  )

(defmacro make-hello-world []

  (list 'fn (vector) (list 'println "Hello World!"))  )
