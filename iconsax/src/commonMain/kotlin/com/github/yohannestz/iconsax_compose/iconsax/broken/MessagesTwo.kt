package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesTwo: ImageVector
    get() {
        val current = _messagesTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessagesTwo",
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
                moveTo(x = 13.17f, y = 2.0f)
                curveToRelative(dx1 = -4.88f, dy1 = 0.0f, dx2 = -8.83f, dy2 = 3.69f, dx3 = -8.83f, dy3 = 8.24f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.38f, y1 = 11.0f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.12f, dy1 = -0.91f)
                curveToRelative(dx1 = 3.04f, dy1 = 0.0f, dx2 = 5.5f, dy2 = 2.3f, dx3 = 5.5f, dy3 = 5.14f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = 3.16f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.35f, dy1 = 0.09f)
                lineToRelative(dx = 4.19f, dy = 2.49f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -0.98f)
                lineToRelative(dx = -0.39f, dy = -3.16f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 10.24f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.07f, dx2 = -1.8f, dy2 = -5.75f, dx3 = -4.48f, dy3 = -7.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.38f, y = 11.0f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.12f, dy1 = -0.91f)
                curveToRelative(dx1 = 3.04f, dy1 = 0.0f, dx2 = 5.5f, dy2 = 2.3f, dx3 = 5.5f, dy3 = 5.14f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = 3.16f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.32f, dy1 = 1.97f)
                lineToRelative(dx = -2.61f, dy = 1.55f)
                curveToRelative(dx1 = -0.44f, dy1 = 0.27f, dx2 = -1.0f, dy2 = -0.1f, dx3 = -0.94f, dy3 = -0.61f)
                lineToRelative(dx = 0.25f, dy = -1.97f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.12f, dy1 = -4.97f)
            }
        }.build().also { _messagesTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _messagesTwo: ImageVector? = null
