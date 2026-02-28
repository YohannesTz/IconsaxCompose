package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Convert: ImageVector
    get() {
        val current = _convert
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Convert",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.73f)
                arcToRelative(a = 10.74f, b = 10.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.45f)
                arcToRelative(a = 10.74f, b = 10.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.45f)
                moveToRelative(dx = 0.0f, dy = -19.96f)
                arcToRelative(a = 9.24f, b = 9.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.47f)
                arcToRelative(a = 9.24f, b = 9.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.46f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.3f, y = 12.95f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineTo(x = 5.61f, y = 4.55f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 6.9f, dy = 6.91f)
                verticalLineTo(y = 7.66f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.74f, dx3 = 0.75f, dy3 = -0.74f)
                curveToRelative(dx1 = 0.41f, dy1 = -0.03f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.74f)
                lineToRelative(dx = -0.01f, dy = 4.54f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = -0.18f, dy2 = 0.58f, dx3 = -0.46f, dy3 = 0.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.05f)
                close()
                moveToRelative(dx = 3.56f, dy = 7.78f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -6.9f, dy = -6.9f)
                verticalLineToRelative(dy = 2.73f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.74f, dx3 = -0.75f, dy3 = 0.74f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.74f)
                lineToRelative(dx = 0.01f, dy = -4.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.18f, dy2 = -0.58f, dx3 = 0.46f, dy3 = -0.7f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = 0.17f)
                lineToRelative(dx = 8.16f, dy = 8.18f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.52f, dy1 = 0.22f)
            }
        }.build().also { _convert = it }
    }

@Suppress("ObjectPropertyName")
private var _convert: ImageVector? = null
