package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val People: ImageVector
    get() {
        val current = _people
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.People",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.0f, y = 7.16f)
                horizontalLineToRelative(dx = -0.2f)
                arcToRelative(a = 2.57f, b = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.47f, dy1 = -2.58f)
                arcTo(horizontalEllipseRadius = 2.57f, verticalEllipseRadius = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.9f, y1 = 2.0f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.58f, dy1 = 2.58f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 2.58f)
                moveToRelative(dx = -1.03f, dy = 7.28f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.94f, dy1 = -0.72f)
                curveToRelative(dx1 = 1.4f, dy1 = -0.94f, dx2 = 1.4f, dy2 = -2.48f, dx3 = 0.0f, dy3 = -3.42f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.97f, dy1 = -0.71f)
                moveTo(x = 5.97f, y = 7.16f)
                horizontalLineToRelative(dx = 0.19f)
                arcToRelative(a = 2.57f, b = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.48f, dy1 = -2.58f)
                arcTo(horizontalEllipseRadius = 2.57f, verticalEllipseRadius = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.06f, y1 = 2.0f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.58f, dy1 = 2.58f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.49f, dy1 = 2.58f)
                moveTo(x = 7.0f, y = 14.44f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.94f, dy1 = -0.72f)
                curveToRelative(dx1 = -1.4f, dy1 = -0.94f, dx2 = -1.4f, dy2 = -2.48f, dx3 = 0.0f, dy3 = -3.42f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.97f, dy1 = -0.71f)
                moveTo(x = 12.0f, y = 14.63f)
                horizontalLineToRelative(dx = -0.2f)
                arcToRelative(a = 2.57f, b = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.47f, dy1 = -2.58f)
                arcToRelative(a = 2.57f, b = 2.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.58f, dy1 = -2.58f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.58f, dy1 = 2.58f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 2.58f)
                moveToRelative(dx = 2.9f, dy = 3.15f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.81f, dy1 = 0.0f)
                curveToRelative(dx1 = -1.41f, dy1 = 0.94f, dx2 = -1.41f, dy2 = 2.48f, dx3 = 0.0f, dy3 = 3.42f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.82f, dy1 = 0.0f)
            }
        }.build().also { _people = it }
    }

@Suppress("ObjectPropertyName")
private var _people: ImageVector? = null
