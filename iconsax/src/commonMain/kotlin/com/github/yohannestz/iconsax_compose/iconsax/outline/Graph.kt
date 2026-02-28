package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Graph: ImageVector
    get() {
        val current = _graph
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Graph",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.32f, y = 12.75f)
                horizontalLineTo(x = 15.0f)
                quadToRelative(dx1 = -3.74f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -4.2f)
                verticalLineTo(y = 5.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.02f, dx2 = 0.12f, dy2 = -2.48f, dx3 = 1.18f, dy3 = -3.28f)
                curveToRelative(dx1 = 0.89f, dy1 = -0.66f, dx2 = 2.17f, dy2 = -0.71f, dx3 = 4.06f, dy3 = -0.16f)
                arcToRelative(a = 7.9f, b = 7.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.27f, dy1 = 5.27f)
                curveToRelative(dx1 = 0.55f, dy1 = 1.88f, dx2 = 0.5f, dy2 = 3.17f, dx3 = -0.16f, dy3 = 4.05f)
                curveToRelative(dx1 = -0.8f, dy1 = 1.07f, dx2 = -2.26f, dy2 = 1.19f, dx3 = -3.28f, dy3 = 1.19f)
                moveToRelative(dx = -4.04f, dy = -9.39f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.94f, dy1 = 0.24f)
                quadToRelative(dx1 = -0.58f, dy1 = 0.42f, dx2 = -0.58f, dy2 = 2.08f)
                verticalLineToRelative(dy = 2.88f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.24f, dx2 = 0.86f, dy2 = 2.7f, dx3 = 2.25f, dy3 = 2.7f)
                horizontalLineToRelative(dx = 3.32f)
                quadToRelative(dx1 = 1.64f, dy1 = 0.0f, dx2 = 2.08f, dy2 = -0.58f)
                quadToRelative(dx1 = 0.52f, dy1 = -0.7f, dx2 = -0.07f, dy2 = -2.73f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.25f, dy1 = -4.25f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.81f, dy1 = -0.34f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.07f, y = 22.75f)
                arcToRelative(a = 9.8f, b = 9.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.69f, dy1 = -8.2f)
                arcTo(horizontalEllipseRadius = 9.85f, verticalEllipseRadius = 9.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.11f, y1 = 3.27f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 3.85f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 0.89f)
                arcToRelative(a = 8.35f, b = 8.35f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 9.86f, dy1 = 9.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.47f, dy1 = 0.29f)
                arcToRelative(a = 9.85f, b = 9.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.68f, dy1 = 7.9f)
            }
        }.build().also { _graph = it }
    }

@Suppress("ObjectPropertyName")
private var _graph: ImageVector? = null
