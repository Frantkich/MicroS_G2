@ECHO OFF
ECHO Reposes toi! tes jars seront dans les bons dossiers dans 2 secondes !

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-article\files\microsg2-article-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-article\target\microsg2-article-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-article\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-server\files\microsg2-server-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-server\target\microsg2-server-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-server\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-gateway\files\microsg2-gateway-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-gateway\target\microsg2-gateway-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-gateway\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-comment\files\microsg2-comment-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-comment\target\microsg2-comment-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-comment\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-client\files\microsg2-client-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-client\target\microsg2-client-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-client\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-category\files\microsg2-category-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-category\target\microsg2-category-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-category\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-bootadmin\files\microsg2-bootAdmin-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-bootAdmin\target\microsg2-bootAdmin-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-bootadmin\files

DEL C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-author\files\microsg2-author-0.0.1-SNAPSHOT.jar
COPY C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\microsg2-author\target\microsg2-author-0.0.1-SNAPSHOT.jar C:\Users\Dev\eclipse-workspace\MicroS_G2\microsg2\docker\ms-author\files

PAUSE