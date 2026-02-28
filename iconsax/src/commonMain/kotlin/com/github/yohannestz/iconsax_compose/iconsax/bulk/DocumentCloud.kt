package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.5f, y = 10.19f)
                horizontalLineToRelative(dx = -2.89f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.3f, dy1 = -4.3f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineTo(x = 8.07f)
                curveTo(x1 = 4.99f, y1 = 2.0f, x2 = 2.5f, y2 = 4.0f, x3 = 2.5f, y3 = 7.57f)
                verticalLineToRelative(dy = 8.86f)
                curveTo(x1 = 2.5f, y1 = 20.0f, x2 = 4.99f, y2 = 22.0f, x3 = 8.07f, y3 = 22.0f)
                horizontalLineToRelative(dx = 7.86f)
                curveToRelative(dx1 = 3.08f, dy1 = 0.0f, dx2 = 5.57f, dy2 = -2.0f, dx3 = 5.57f, dy3 = -5.57f)
                verticalLineToRelative(dy = -5.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
            }
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
        }.build().also { _documentCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCloud: ImageVector? = null
