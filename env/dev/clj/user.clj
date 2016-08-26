(ns user
  (:require [mount.core :as mount]
            [mlfirst.figwheel :refer [start-fw stop-fw cljs]]
            mlfirst.core))

(defn start []
  (mount/start-without #'mlfirst.core/repl-server))

(defn stop []
  (mount/stop-except #'mlfirst.core/repl-server))

(defn restart []
  (stop)
  (start))


