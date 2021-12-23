import type { NextPage } from 'next'
import styles from '../styles/Home.module.css'

const Home: NextPage = () => {
  const title = 'Hello World'

  return (
    <div className={styles.container}>
      <h1>{title}</h1>
    </div>
  )
}

export default Home
