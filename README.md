<p align="center">
    <img src="https://www.svgrepo.com/show/224779/center-alignment-alignment.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">MULTIDATASOURCECONENCTIONDATAJPA</h1></p>
<p align="center">
	<em><code>❯DS Connector</code></em>
</p>
<p align="center">
	<!-- local repository, no metadata badges. --></p>
<p align="center">Built with the tools and technologies:</p>
<p align="center">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=default&logo=openjdk&logoColor=white" alt="java">
</p>
<br>

##  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Project Structure](#-project-structure)
  - [ Project Index](#-project-index)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
---

##  Overview

<code>❯ In this project, we’ll implement a simple Spring configuration for a Spring Data JPA system with multiple databases.</code>

---

##  Features

<code>❯ Multi DataSource Connectivity</code>
<code>❯ Rest Application</code>
<code>❯ Custom EntityManager Creation</code>

---

##  Project Structure

```sh
└── MultiDataSourceConenctionDataJPA/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```


###  Project Index
<details open>
	<summary><b><code>MULTIDATASOURCECONENCTIONDATAJPA/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/mvnw'>mvnw</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/mvnw.cmd'>mvnw.cmd</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>jpa</b></summary>
										<blockquote>
											<details>
												<summary><b>app</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\MultiDataSourceConenctionDataJpaApplication.java'>MultiDataSourceConenctionDataJpaApplication.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
													<details>
														<summary><b>configurations</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\configurations\HotelEntityDatatSourceConfiguration.java'>HotelEntityDatatSourceConfiguration.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\configurations\HotelEntityJPAConfiguration.java'>HotelEntityJPAConfiguration.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\configurations\UserEntityDatatSourceConfiguration.java'>UserEntityDatatSourceConfiguration.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\configurations\UserEntityJPAConfiguration.java'>UserEntityJPAConfiguration.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>controller</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\controller\ServiceHandlerController.java'>ServiceHandlerController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>service</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\service\RequestHandlerService.java'>RequestHandlerService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>entity</b></summary>
														<blockquote>
															<details>
																<summary><b>hotel</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\entity\hotel\HotelEntity.java'>HotelEntity.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>user</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\entity\user\UserEntity.java'>UserEntity.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
													<details>
														<summary><b>repo</b></summary>
														<blockquote>
															<details>
																<summary><b>hotel</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\repo\hotel\HotelEntityRepository.java'>HotelEntityRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>user</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\main\java\com\jpa\app\repo\user\UserEntityrepository.java'>UserEntityrepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>jpa</b></summary>
										<blockquote>
											<details>
												<summary><b>app</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='./MultiDataSourceConenctionDataJPA/blob/master/src\test\java\com\jpa\app\MultiDataSourceConenctionDataJpaApplicationTests.java'>MultiDataSourceConenctionDataJpaApplicationTests.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
##  Getting Started

###  Prerequisites

Before getting started with MultiDataSourceConenctionDataJPA, ensure you meets the following requirements:

- **Programming Language:** Java
- **understanding of:** EntityManager, TransactionManager, DataSourceproperties, Spring REST, Spring Data JPA


###  Installation

Install MultiDataSourceConenctionDataJPA using one of the following methods:

**Build from source:**

1. Clone the MultiDataSourceConenctionDataJPA repository:
```sh
❯ git clone ../MultiDataSourceConenctionDataJPA
```

2. Import as an Existing Spring project in your IDE:
```sh
❯ Start Coding!!
```

---

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your LOCAL account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone ./MultiDataSourceConenctionDataJPA
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to LOCAL**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>


---
