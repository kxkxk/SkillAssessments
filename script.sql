USE [master]
GO
/****** Object:  Database [stulog]    Script Date: 2020/5/14 17:41:32 ******/
CREATE DATABASE [stulog]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'stulog', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\stulog.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'stulog_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\stulog_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [stulog] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [stulog].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [stulog] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [stulog] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [stulog] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [stulog] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [stulog] SET ARITHABORT OFF 
GO
ALTER DATABASE [stulog] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [stulog] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [stulog] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [stulog] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [stulog] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [stulog] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [stulog] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [stulog] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [stulog] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [stulog] SET  ENABLE_BROKER 
GO
ALTER DATABASE [stulog] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [stulog] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [stulog] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [stulog] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [stulog] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [stulog] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [stulog] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [stulog] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [stulog] SET  MULTI_USER 
GO
ALTER DATABASE [stulog] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [stulog] SET DB_CHAINING OFF 
GO
ALTER DATABASE [stulog] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [stulog] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [stulog] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [stulog] SET QUERY_STORE = OFF
GO
USE [stulog]
GO
/****** Object:  Table [dbo].[QnA]    Script Date: 2020/5/14 17:41:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QnA](
	[Qid] [int] IDENTITY(1,1) NOT NULL,
	[Qtext] [varchar](255) NULL,
	[A] [varchar](255) NULL,
	[B] [varchar](255) NULL,
	[C] [varchar](255) NULL,
	[D] [varchar](255) NULL,
	[T] [varchar](255) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stu]    Script Date: 2020/5/14 17:41:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stu](
	[name] [varchar](255) NULL,
	[id] [varchar](255) NULL,
	[pas] [varchar](255) NULL,
	[NO] [int] IDENTITY(1,1) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tea]    Script Date: 2020/5/14 17:41:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tea](
	[name] [varchar](255) NULL,
	[id] [int] NULL,
	[pas] [varchar](255) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[QnA] ON 

INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (8, N'____记载的秦始皇七年（公元前240年）的彗星，各国学者认为这是世界上最早的哈雷彗星记录。', N'《淮南子》', N'《史记》', N'《礼记月令》', N'《授时历》', N'B')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (9, N'我国的个人的工资、薪金所得缴纳个人所得税采用的是什么税率____。', N'比例税率', N'超额累进税率', N'定额税率', N'超率累进税率', N'B')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (10, N'根据《中华人民共和国国家安全法》规定，____依照宪法规定，决定战争状态的宣布，决定全国总动员或者局部动员，决定全国或者个别省、自治区、直辖市进入紧急状态，行使宪法规定的和全国人民代表大会授予的涉及国家安全的其他职权。', N'全国人民代表大会', N'全国人民代表大会常务委员会', N'中华人民共和国主席', N'国务院', N'B')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (11, N'全国首个国家生态文明试验区是____。', N'福建', N'贵州', N'江西', N'海南', N'A')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (12, N'采用引漳灌邺的方法使得邺城民富兵强，称为战国时期魏国的东北重镇的人是____。', N'大禹', N'孙叔敖', N'西门豹', N'史禄', N'C')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (13, N'在福建宁德工作期间，习近平总书记曾指出能否有效制止腐败现象关系到党的生死存亡和社会主义事业的成败，这就需要建立各种有效的监督机制，其中____的监督是最经常、公开、广泛的一种监督方式。', N'人大', N'党内', N'新闻媒介', N'无', N'C')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (14, N'行政机关应当建立健全政府信息发布____审查机制，明确审查的程序和责任。', N'公开', N'涉密', N'保密', N'密点', N'C')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (15, N'党支部党员大会是党支部的议事决策机构，由全体党员参加，一般每季度召开____次。', N'1', N'2', N'3', N'4', N'A')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (16, N'我国现行《宪法》自颁布后，共进行了____次修改。', N'2', N'3', N'4', N'5', N'D')
INSERT [dbo].[QnA] ([Qid], [Qtext], [A], [B], [C], [D], [T]) VALUES (17, N'科学与技术的关系是____。', N'相同的概念', N'不同的概念', N'不同的概念，但又存在紧密的联系', N'无', N'C')
SET IDENTITY_INSERT [dbo].[QnA] OFF
SET IDENTITY_INSERT [dbo].[Stu] ON 

INSERT [dbo].[Stu] ([name], [id], [pas], [NO]) VALUES (N'测试人员', N'001', N'123456Ssd', 7)
SET IDENTITY_INSERT [dbo].[Stu] OFF
INSERT [dbo].[Tea] ([name], [id], [pas]) VALUES (N'Admin', 1, N'admin')
USE [master]
GO
ALTER DATABASE [stulog] SET  READ_WRITE 
GO
