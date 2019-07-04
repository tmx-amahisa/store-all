-- MySQL dump 10.13  Distrib 5.6.29, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: bookstore
-- ------------------------------------------------------
-- Server version	5.6.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `bookstore`
--

/*!40000 DROP DATABASE IF EXISTS `bookstore`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `bookstore` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bookstore`;

--
-- Table structure for table `AUTHOR`
--

DROP TABLE IF EXISTS `AUTHOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AUTHOR` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(10) NOT NULL,
  `NAME` varchar(35) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AUTHOR`
--

LOCK TABLES `AUTHOR` WRITE;
/*!40000 ALTER TABLE `AUTHOR` DISABLE KEYS */;
INSERT INTO `AUTHOR` VALUES (1,'4798140929','寺田 佳央'),(2,'4798140929','猪瀬 淳'),(3,'4798140929','藤田 益嗣'),(4,'4798140929','羽生田 恒永'),(5,'4798140929','梶浦 美咲'),(6,'4621066056','Joshua Bloch'),(7,'4873114675','Bill Burke'),(8,'4873114675','arton'),(9,'4873114780','Peter B. MacIntyre'),(10,'4873110912','Ben Albahari'),(11,'4873110912','Peter Drayton'),(12,'4873110912','Brad Merrill'),(13,'4798144029','山田 祥寛'),(14,'4873114047','吉岡 弘隆'),(15,'4873114047','大和 一洋'),(16,'4873114047','大岩 尚宏'),(17,'4873114047','安部 東洋'),(18,'4873114047','吉田 俊輔');
/*!40000 ALTER TABLE `AUTHOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BOOK`
--

DROP TABLE IF EXISTS `BOOK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BOOK` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` longtext,
  `ISBN` varchar(10) NOT NULL,
  `PRICE` double NOT NULL,
  `STOCK` int(11) NOT NULL,
  `TITLE` varchar(200) NOT NULL,
  `YEAR` date NOT NULL,
  `PUBLISHER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_BOOK_PUBLISHER_ID` (`PUBLISHER_ID`),
  CONSTRAINT `FK_BOOK_PUBLISHER_ID` FOREIGN KEY (`PUBLISHER_ID`) REFERENCES `PUBLISHER` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOK`
--

LOCK TABLES `BOOK` WRITE;
/*!40000 ALTER TABLE `BOOK` DISABLE KEYS */;
INSERT INTO `BOOK` VALUES (1,'Javaによる業務システム開発向けの標準仕様であるJava EE。本書は、フレームワークとしての基盤機能が一層充実したJava EE 7の基本と実践的な開発方法を学ぶための書籍です。Javaの基本文法を身につけた方を対象に、プレゼンテーション層の開発機能JSFやビジネスロジック層の開発機能CDI/EJB、データアクセス層の開発機能JPAなど、業務システム開発時に必要不可欠な機能群の使い方や活用方法を、具体的なサンプルを交えて詳しく解説します。Java EE 7で追加されたWebサービスやバッチ処理の機能についてもカバーしています。これからJava EE開発を始める方、Java EEの機能をもっと使いこなしたい方など、業務システム開発に携わるJavaエンジニアにおすすめの一冊です。','4798140929',3800,30,'Java EE 7徹底入門 標準Javaフレームワークによる高信頼性Webシステムの構築','2015-12-16',1),(2,'著者が、グーグル社やサンマイクロシステムズ社におけるソフトウェア開発で得た知識・経験をまとめたJavaプログラミングの定本。Javaでプログラミングをするすべてのエンジニア必読の書。','4621066056',3600,20,'EFFECTIVE JAVA 第2版 (The Java Series)','2008-11-01',2),(3,'Java EE 6でサポートされたJAX-RSの特徴とRESTfulアーキテクチャ原則を使って、Javaでの分散Webサービスを設計開発する方法を学ぶ書籍。理論よりも実装に焦点を当て、RESTのアーキテクチャから実装までを豊富なサンプルコードとともに解説します。前半では、URIの決定方法、HTTPコンテンツネゴシエーション、HATEOASなどRESTとJAX-RSの概要について解説し、後半のワークブックでは、前半の技術解説で取り上げた設定、実行などを例題と共に学習します。JAX-RS仕様の解説と具体的な利用例からなる本書を読むことで、Javaの新しいデザイン手法であるアノテーションやインジェクションなどについても自然と学ぶことができるでしょう。柔軟なAPIを提供するJAX-RSを題材にRESTについて学べる本書は、Javaの最新動向を学習したいプログラマ／設計者必携の一冊です。','4873114675',3456,1,'JavaによるRESTfulシステム構築','2010-08-01',3),(4,'本書は、PHPの最も便利な機能を取り上げて詳しく解説し、さらに、どうすればウェブ開発のプロセスをスピードアップできるのか、よく利用されるPHPのエレメントが誤って実装されてしまうことがあるのはなぜなのか、どんな「パーツ」がオブジェクト指向プログラミングに適するのかといった実際的な問題の理由を解き明かします。PHPの初学者から他の言語で開発経験のある開発者まで、幅広い読者を対象としており、基本項目を軸にしてていねいに解説。手早くPHPについての理解を深めることができます。プロフェッショナルな開発者にとっては、既存の知識やテクニックを棚卸しして、新鮮な視点を取り入れるきっかけとして役立つでしょう。','4873114780',1944,35,'PHP: The Good Parts','2010-12-01',3),(5,'C#言語は、Microsoft .NETプラットフォームでさまざまなアプリケーションを開発するのに適したオブジェクト指向言語です。また、C#で開発するためには、そのプラッ トフォームである.NET Frameworkは欠かせません。本書では、そのC#言語の要素をなす文法上の特徴や.NET Frameworkを用いたプログラミング、主な.NET Frameworkのクラスライブラリをコンパクトに解説しています。C#に興味のある方やこれからC#を使ってみたいという方に最適な1冊です。また、C#はどのような言語かを知りたい方も、本書を覗いてみるといいかもしれません。','4873110912',2808,3,'C# エッセンシャルズ 第2版','2002-07-01',3),(6,'ASP.NET入門書が最新の技術に対応し、ますますパワーアップ! Visual Studio/ASP.NETによるWebプログラミングの標準教科書『独習ASP.NET』が最新のVisual Studio 2015/ASP.Net 4.6に対応。Visual StudioでWebアプリケーション・Webフォームを開発する際に必要となる、基礎的な知識やASP.NETの仕組みから、サーバーコントロールの使い方と使い分け、データベース連携、状態管理、Ajax/jQueryまで、詳細かつ丁寧に解説しています。また、今回の改訂では、新たにASP.NET Identityの実装や、オープンソースのBootstrapとの連携といった機能の解説を追加しています。本書は解説、練習問題、理解度チェックという3つのステップで、Webアプリケーション開発の基礎・基本テクニックをしっかりと習得することができます。実際にサンプルコードを入力し、動作を確認しながら学習することで、いっそう理解が深めることができます。本番環境としては、従来から使用されているInternet Information Servicesだけでなく、Microsoft Azure上でも動作させられる手順を紹介しています。ASP.NETを一からしっかり学びたいという方にオススメの一冊です。','4798144029',3800,2,'独習ASP.NET 第5版','2016-01-22',1),(7,'ミラクル・リナックス株式会社の精鋭エンジニアたちが、長年のLinuxカーネル開発の経験で培ったデバッグテクニックを詳解。こころがまえから、準備、必要な知識、バグの原因をすばやく特定し修正するために必要なテクニックとツール、高度なデバッグ技まで惜しみなく披露します。多くの事例に基づいた実際的実用的な技が満載です。','4873114047',3456,10,'Debug Hacks -デバッグを極めるテクニック&ツール','2009-04-27',3);
/*!40000 ALTER TABLE `BOOK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ORDERLINE`
--

DROP TABLE IF EXISTS `ORDERLINE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ORDERLINE` (
  `ID` int(11) NOT NULL,
  `COUNT` int(11) DEFAULT NULL,
  `DATE` datetime DEFAULT NULL,
  `USER_ID` varchar(255) DEFAULT NULL,
  `BOOK_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ORDERLINE_BOOK_ID` (`BOOK_ID`),
  KEY `FK_ORDERLINE_USER_ID` (`USER_ID`),
  CONSTRAINT `FK_ORDERLINE_BOOK_ID` FOREIGN KEY (`BOOK_ID`) REFERENCES `BOOK` (`ID`),
  CONSTRAINT `FK_ORDERLINE_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `USER` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ORDERLINE`
--

LOCK TABLES `ORDERLINE` WRITE;
/*!40000 ALTER TABLE `ORDERLINE` DISABLE KEYS */;
/*!40000 ALTER TABLE `ORDERLINE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PUBLISHER`
--

DROP TABLE IF EXISTS `PUBLISHER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PUBLISHER` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PUBLISHER`
--

LOCK TABLES `PUBLISHER` WRITE;
/*!40000 ALTER TABLE `PUBLISHER` DISABLE KEYS */;
INSERT INTO `PUBLISHER` VALUES (1,'翔泳社'),(2,'丸善出版'),(3,'オライリージャパン');
/*!40000 ALTER TABLE `PUBLISHER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `USER`
--

DROP TABLE IF EXISTS `USER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `USER` (
  `ID` varchar(255) NOT NULL,
  `FIRST` varchar(255) DEFAULT NULL,
  `LAST` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USER`
--

LOCK TABLES `USER` WRITE;
/*!40000 ALTER TABLE `USER` DISABLE KEYS */;
/*!40000 ALTER TABLE `USER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `USER_ORDERLINE`
--

DROP TABLE IF EXISTS `USER_ORDERLINE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `USER_ORDERLINE` (
  `USER_ID` varchar(255) NOT NULL,
  `orders_ID` int(11) NOT NULL,
  PRIMARY KEY (`USER_ID`,`orders_ID`),
  KEY `FK_USER_ORDERLINE_orders_ID` (`orders_ID`),
  CONSTRAINT `FK_USER_ORDERLINE_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `USER` (`ID`),
  CONSTRAINT `FK_USER_ORDERLINE_orders_ID` FOREIGN KEY (`orders_ID`) REFERENCES `ORDERLINE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USER_ORDERLINE`
--

LOCK TABLES `USER_ORDERLINE` WRITE;
/*!40000 ALTER TABLE `USER_ORDERLINE` DISABLE KEYS */;
/*!40000 ALTER TABLE `USER_ORDERLINE` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-06  2:44:30
