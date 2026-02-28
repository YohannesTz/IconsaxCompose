package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendTwo: ImageVector
    get() {
        val current = _sendTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SendTwo",
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
                moveTo(x = 7.11f, y = 5.96f)
                lineToRelative(dx = 9.02f, dy = -3.0f)
                curveToRelative(dx1 = 4.05f, dy1 = -1.36f, dx2 = 6.25f, dy2 = 0.85f, dx3 = 4.91f, dy3 = 4.9f)
                lineToRelative(dx = -3.01f, dy = 9.02f)
                curveToRelative(dx1 = -2.02f, dy1 = 6.07f, dx2 = -5.34f, dy2 = 6.07f, dx3 = -7.36f, dy3 = 0.0f)
                lineTo(x = 9.78f, y = 14.2f)
                lineTo(x = 7.1f, y = 13.31f)
                curveToRelative(dx1 = -6.06f, dy1 = -2.0f, dx2 = -6.06f, dy2 = -5.32f, dx3 = 0.01f, dy3 = -7.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.12f, y = 11.63f)
                lineToRelative(dx = 3.81f, dy = -3.82f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.8f, dy = -3.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -3.8f, dy = 3.82f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _sendTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _sendTwo: ImageVector? = null
