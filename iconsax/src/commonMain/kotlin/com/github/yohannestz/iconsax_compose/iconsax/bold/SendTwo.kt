package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 16.14f, y = 2.96f)
                lineToRelative(dx = -9.03f, dy = 3.0f)
                curveToRelative(dx1 = -6.07f, dy1 = 2.03f, dx2 = -6.07f, dy2 = 5.34f, dx3 = 0.0f, dy3 = 7.36f)
                lineToRelative(dx = 2.68f, dy = 0.89f)
                lineToRelative(dx = 0.89f, dy = 2.68f)
                curveToRelative(dx1 = 2.02f, dy1 = 6.07f, dx2 = 5.34f, dy2 = 6.07f, dx3 = 7.36f, dy3 = 0.0f)
                lineToRelative(dx = 3.01f, dy = -9.02f)
                curveToRelative(dx1 = 1.34f, dy1 = -4.05f, dx2 = -0.86f, dy2 = -6.26f, dx3 = -4.91f, dy3 = -4.91f)
                moveToRelative(dx = 0.32f, dy = 5.38f)
                lineToRelative(dx = -3.8f, dy = 3.82f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.8f, dy = -3.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _sendTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _sendTwo: ImageVector? = null
