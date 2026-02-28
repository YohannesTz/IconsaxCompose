package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nebulas: ImageVector
    get() {
        val current = _nebulas
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Nebulas",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 10.75f)
                lineToRelative(dx = -0.41f, dy = 0.2f)
                horizontalLineToRelative(dx = -0.01f)
                lineTo(x = 9.4f, y = 13.39f)
                lineToRelative(dx = 1.07f, dy = -3.34f)
                lineToRelative(dx = 3.08f, dy = -1.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.55f, y = 8.65f)
                lineToRelative(dx = -3.08f, dy = 1.39f)
                lineTo(x = 12.0f, y = 5.25f)
                close()
                moveToRelative(dx = -3.08f, dy = 1.39f)
                lineTo(x = 9.4f, y = 13.38f)
                lineTo(x = 6.0f, y = 12.25f)
                lineToRelative(dx = 2.18f, dy = -1.09f)
                lineTo(x = 10.0f, y = 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 12.25f)
                lineToRelative(dx = -4.5f, dy = 2.5f)
                lineToRelative(dx = -0.31f, dy = -0.1f)
                lineToRelative(dx = -0.09f, dy = -0.03f)
                lineToRelative(dx = -3.7f, dy = -1.24f)
                lineToRelative(dx = 4.68f, dy = -2.42f)
                horizontalLineToRelative(dx = 0.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.19f, y = 14.65f)
                lineTo(x = 13.0f, y = 15.25f)
                lineToRelative(dx = -1.0f, dy = 3.0f)
                lineToRelative(dx = -2.5f, dy = -4.68f)
                lineToRelative(dx = -0.1f, dy = -0.2f)
                lineToRelative(dx = 3.7f, dy = 1.25f)
                close()
            }
        }.build().also { _nebulas = it }
    }

@Suppress("ObjectPropertyName")
private var _nebulas: ImageVector? = null
