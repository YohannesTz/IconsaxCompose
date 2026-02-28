package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashCircle: ImageVector
    get() {
        val current = _flashCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 3.75f, dy = 10.35f)
                lineTo(x = 12.0f, y = 16.58f)
                lineToRelative(dx = -0.44f, dy = 0.5f)
                curveToRelative(dx1 = -0.61f, dy1 = 0.69f, dx2 = -1.11f, dy2 = 0.51f, dx3 = -1.11f, dy3 = -0.42f)
                verticalLineTo(y = 12.7f)
                horizontalLineToRelative(dx = -1.7f)
                curveToRelative(dx1 = -0.77f, dy1 = 0.0f, dx2 = -0.98f, dy2 = -0.47f, dx3 = -0.47f, dy3 = -1.05f)
                lineTo(x = 12.0f, y = 7.42f)
                lineToRelative(dx = 0.44f, dy = -0.5f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.69f, dx2 = 1.11f, dy2 = -0.51f, dx3 = 1.11f, dy3 = 0.42f)
                verticalLineToRelative(dy = 3.96f)
                horizontalLineToRelative(dx = 1.7f)
                curveToRelative(dx1 = 0.77f, dy1 = 0.0f, dx2 = 0.98f, dy2 = 0.47f, dx3 = 0.47f, dy3 = 1.05f)
            }
        }.build().also { _flashCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _flashCircle: ImageVector? = null
