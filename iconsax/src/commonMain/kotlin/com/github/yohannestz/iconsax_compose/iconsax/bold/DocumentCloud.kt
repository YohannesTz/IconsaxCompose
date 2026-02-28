package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentCloud: ImageVector
    get() {
        val current = _documentCloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentCloud",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.8f, y = 2.21f)
                curveToRelative(dx1 = -0.41f, dy1 = -0.41f, dx2 = -1.12f, dy2 = -0.13f, dx3 = -1.12f, dy3 = 0.44f)
                verticalLineToRelative(dy = 3.49f)
                arcToRelative(a = 2.73f, b = 2.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.75f, dy1 = 2.67f)
                lineToRelative(dx = 3.4f, dy = 0.01f)
                curveToRelative(dx1 = 0.57f, dy1 = 0.0f, dx2 = 0.87f, dy2 = -0.67f, dx3 = 0.47f, dy3 = -1.07f)
                close()
                moveToRelative(dx = -1.04f, dy = 17.05f)
                curveToRelative(dx1 = -2.35f, dy1 = 0.17f, dx2 = -2.35f, dy2 = 3.57f, dx3 = 0.0f, dy3 = 3.74f)
                horizontalLineToRelative(dx = 5.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.82f, dy1 = -0.7f)
                curveToRelative(dx1 = 1.65f, dy1 = -1.44f, dx2 = 0.77f, dy2 = -4.32f, dx3 = -1.4f, dy3 = -4.59f)
                curveToRelative(dx1 = -0.78f, dy1 = -4.69f, dx2 = -7.56f, dy2 = -2.9f, dx3 = -5.96f, dy3 = 1.56f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.5f, y = 11.19f)
                verticalLineToRelative(dy = 3.25f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = -0.44f, dy2 = 0.44f, dx3 = -0.66f, dy3 = 0.23f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -1.04f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.84f, dy1 = 1.27f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.21f, dy1 = 3.07f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = 0.47f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.29f, dy1 = 2.92f)
                curveToRelative(dx1 = 0.02f, dy1 = 0.32f, dx2 = -0.21f, dy2 = 0.63f, dx3 = -0.54f, dy3 = 0.63f)
                horizontalLineToRelative(dx = -2.9f)
                curveToRelative(dx1 = -3.08f, dy1 = 0.0f, dx2 = -5.57f, dy2 = -2.0f, dx3 = -5.57f, dy3 = -5.57f)
                verticalLineTo(y = 7.57f)
                curveTo(x1 = 2.5f, y1 = 4.0f, x2 = 4.99f, y2 = 2.0f, x3 = 8.07f, y3 = 2.0f)
                horizontalLineToRelative(dx = 4.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 2.89f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.3f, dy1 = 4.3f)
                horizontalLineToRelative(dx = 2.89f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
            }
        }.build().also { _documentCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCloud: ImageVector? = null
