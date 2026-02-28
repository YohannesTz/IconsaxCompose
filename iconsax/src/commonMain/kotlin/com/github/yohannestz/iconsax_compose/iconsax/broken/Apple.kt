package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apple: ImageVector
    get() {
        val current = _apple
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Apple",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.16f, y = 17.79f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.93f, dy1 = 1.72f)
                curveTo(x1 = 6.85f, y1 = 20.68f, x2 = 7.87f, y2 = 21.99f, x3 = 9.2f, y3 = 22.0f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.01f, dx2 = 0.92f, dy2 = -0.16f, dx3 = 1.32f, dy3 = -0.34f)
                curveToRelative(dx1 = 0.46f, dy1 = -0.2f, dx2 = 0.95f, dy2 = -0.43f, dx3 = 1.81f, dy3 = -0.43f)
                curveToRelative(dx1 = 0.86f, dy1 = -0.01f, dx2 = 1.35f, dy2 = 0.22f, dx3 = 1.8f, dy3 = 0.43f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.42f, y1 = 22.0f)
                curveToRelative(dx1 = 1.33f, dy1 = -0.01f, dx2 = 2.41f, dy2 = -1.47f, dx3 = 3.17f, dy3 = -2.63f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.17f, dy1 = -2.2f)
                curveToRelative(dx1 = -3.08f, dy1 = -1.17f, dx2 = -3.58f, dy2 = -5.56f, dx3 = -0.53f, dy3 = -7.24f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.47f, dy1 = -1.84f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.05f, dy1 = 0.44f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.4f, dy1 = 0.34f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.0f, dx2 = -1.05f, dy2 = -0.18f, dx3 = -1.57f, dy3 = -0.36f)
                curveToRelative(dx1 = -0.57f, dy1 = -0.2f, dx2 = -1.16f, dy2 = -0.42f, dx3 = -1.9f, dy3 = -0.42f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.8f, dy1 = 2.29f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 2.65f)
                moveTo(x = 15.41f, y = 2.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = 2.95f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.79f, dy1 = 1.42f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = -2.88f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.41f, y1 = 2.0f)
            }
        }.build().also { _apple = it }
    }

@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
