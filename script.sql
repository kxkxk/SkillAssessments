USE [master]
GO
/****** Object:  Database [stulog]    Script Date: 2020/5/14 16:25:55 ******/
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
/****** Object:  Table [dbo].[QnA]    Script Date: 2020/5/14 16:25:55 ******/
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
/****** Object:  Table [dbo].[Stu]    Script Date: 2020/5/14 16:25:55 ******/
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
/****** Object:  Table [dbo].[Tea]    Script Date: 2020/5/14 16:25:55 ******/
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
USE [master]
GO
ALTER DATABASE [stulog] SET  READ_WRITE 
GO
