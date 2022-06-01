(ns macro-workshop.secret-magic)

(defmacro local-env []
  (let [ks (keys &env)]
    (prn (vals &env))
    `(zipmap '~ks [~@ks]))
  )
(comment (defmacro local-env [] (->> (keys &env)
                             (map (fn [k] [`'~k k])) (into {})))

 (defmacro local-env [] (->> (keys &env)
                             (map (fn [k] [`(quote ~k) k])) (into {})))

 (defmacro local-env [] (->> (keys &env)
                             (map (fn [k] [(list 'quote k) k])) (into {}))))

(comment (let [xyz "ZYX"] (macroexpand-1 '(local-env))))
(comment (let [xyz "ZYX"] (local-env)))
(clojure.walk/macroexpand-all '(let [xxx "111"] (local-env)))