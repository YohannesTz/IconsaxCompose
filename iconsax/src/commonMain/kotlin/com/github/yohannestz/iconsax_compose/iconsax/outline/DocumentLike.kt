package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentLike: ImageVector
    get() {
        val current = _documentLike
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentLike",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -3.65f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.1f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.65f, dx2 = 2.1f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.65f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.1f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.65f, dx2 = -2.1f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -8.0f, dy = -20.0f)
                curveTo(x1 = 5.14f, y1 = 2.75f, x2 = 3.75f, y2 = 4.14f, x3 = 3.75f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.86f, dx2 = 1.39f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 8.0f)
                quadToRelative(dx1 = 4.27f, dy1 = 0.02f, dx2 = 4.25f, dy2 = -4.25f)
                verticalLineTo(y = 7.0f)
                quadTo(x1 = 20.27f, y1 = 2.73f, x2 = 16.0f, y2 = 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 9.25f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.75f, dy1 = -2.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = 1.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -8.23f, dy = 9.47f)
                curveToRelative(dx1 = -0.88f, dy1 = -0.02f, dx2 = -2.9f, dy2 = -1.1f, dx3 = -3.5f, dy3 = -3.0f)
                curveToRelative(dx1 = -0.43f, dy1 = -1.33f, dx2 = 0.07f, dy2 = -3.1f, dx3 = 1.6f, dy3 = -3.6f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.89f, dy1 = 0.23f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -0.22f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.5f, dx2 = 2.04f, dy2 = 2.25f, dx3 = 1.63f, dy3 = 3.59f)
                curveToRelative(dx1 = -0.62f, dy1 = 1.98f, dx2 = -2.75f, dy2 = 3.0f, dx3 = -3.52f, dy3 = 3.0f)
                moveTo(x = 8.2f, y = 15.26f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.1f, dy1 = 1.96f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.06f, dy1 = -1.96f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.66f, dx2 = -0.01f, dy2 = -1.5f, dx3 = -0.66f, dy3 = -1.71f)
                curveToRelative(dx1 = -0.26f, dy1 = -0.08f, dx2 = -0.63f, dy2 = -0.04f, dx3 = -0.8f, dy3 = 0.22f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.34f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = -0.32f)
                curveToRelative(dx1 = -0.2f, dy1 = -0.28f, dx2 = -0.56f, dy2 = -0.32f, dx3 = -0.82f, dy3 = -0.24f)
                curveToRelative(dx1 = -0.64f, dy1 = 0.2f, dx2 = -0.85f, dy2 = 1.06f, dx3 = -0.64f, dy3 = 1.7f)
            }
        }.build().also { _documentLike = it }
    }

@Suppress("ObjectPropertyName")
private var _documentLike: ImageVector? = null
