(def mario {:name "Mario" :main-color "Red" :jump 10})
(def serializable-mario (with-meta mario {:serializable true}))

(println (str "mario = serializable-mario => " (= mario serializable-mario)))
