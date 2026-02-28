package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Image: ImageVector
    get() {
        val current = _image
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Image",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.02f, y = 16.82f)
                lineTo(x = 18.89f, y = 9.5f)
                curveToRelative(dx1 = -0.57f, dy1 = -1.34f, dx2 = -1.42f, dy2 = -2.1f, dx3 = -2.4f, dy3 = -2.15f)
                curveToRelative(dx1 = -0.95f, dy1 = -0.05f, dx2 = -1.88f, dy2 = 0.62f, dx3 = -2.6f, dy3 = 1.9f)
                lineTo(x = 12.0f, y = 12.66f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.72f, dx2 = -0.96f, dy2 = 1.15f, dx3 = -1.58f, dy3 = 1.2f)
                reflectiveCurveToRelative(dx1 = -1.26f, dy1 = -0.27f, dx2 = -1.77f, dy2 = -0.92f)
                lineToRelative(dx = -0.22f, dy = -0.28f)
                curveToRelative(dx1 = -0.71f, dy1 = -0.89f, dx2 = -1.6f, dy2 = -1.32f, dx3 = -2.5f, dy3 = -1.23f)
                reflectiveCurveToRelative(dx1 = -1.66f, dy1 = 0.71f, dx2 = -2.17f, dy2 = 1.72f)
                lineTo(x = 2.02f, y = 16.6f)
                arcToRelative(a = 3.97f, b = 3.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.56f, dy1 = 5.77f)
                horizontalLineToRelative(dx = 12.76f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.68f, dy1 = -5.55f)
                moveTo(x = 6.97f, y = 8.38f)
                arcToRelative(a = 3.38f, b = 3.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.76f)
                arcToRelative(a = 3.38f, b = 3.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.76f)
            }
        }.build().also { _image = it }
    }

@Suppress("ObjectPropertyName")
private var _image: ImageVector? = null
