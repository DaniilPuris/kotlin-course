package lesson31.homework

import com.daniilpuris.lesson31.homework.Cereal
import com.daniilpuris.lesson31.homework.CerealStorageImpl
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CerealStorageImplTest {
    private val delta = 0.01f
    private val storage = CerealStorageImpl(
        containerCapacity = 10.0f,
        storageCapacity = 30.0f
    )

    @Test
    fun `test initialization with invalid container capacity`() {
        assertThrows<IllegalArgumentException> {
            CerealStorageImpl(containerCapacity = -1.0f, storageCapacity = 30.0f)
        }
    }

    @Test
    fun `test initialization with invalid storage capacity`() {
        assertThrows<IllegalArgumentException> {
            CerealStorageImpl(containerCapacity = 10.0f, storageCapacity = 5.0f)
        }
    }

    @Test
    fun `test addCereal with negative amount`() {
        assertThrows<IllegalArgumentException> {
            storage.addCereal(Cereal.RICE, -1.0f)
        }
    }

    @Test
    fun `test addCereal with valid amount`() {
        val remainder = storage.addCereal(Cereal.RICE, 8.0f)
        assertEquals(0.0f, remainder, delta)
        assertEquals(8.0f, storage.getAmount(Cereal.RICE), delta)
    }

    @Test
    fun `test addCereal with overflow`() {
        val remainder = storage.addCereal(Cereal.RICE, 12.0f)
        assertEquals(2.0f, remainder, delta)
        assertEquals(10.0f, storage.getAmount(Cereal.RICE), delta)
    }
}