package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessagesOne: ImageVector
    get() {
        val current = _messagesOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessagesOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.98f, y = 10.79f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = 0.75f)
                quadToRelative(dx1 = -0.35f, dy1 = 4.05f, dx2 = -4.75f, dy2 = 4.04f)
                horizontalLineToRelative(dx = -0.4f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = 0.32f)
                lineToRelative(dx = -1.2f, dy = 1.6f)
                curveToRelative(dx1 = -0.53f, dy1 = 0.71f, dx2 = -1.39f, dy2 = 0.71f, dx3 = -1.92f, dy3 = 0.0f)
                lineToRelative(dx = -1.2f, dy = -1.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = -0.32f)
                horizontalLineToRelative(dx = -0.4f)
                curveTo(x1 = 3.6f, y1 = 19.58f, x2 = 2.0f, y2 = 18.79f, x3 = 2.0f, y3 = 14.79f)
                verticalLineToRelative(dy = -4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -4.4f, dx2 = 4.04f, dy2 = -4.75f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.79f, y1 = 6.0f)
                horizontalLineToRelative(dx = 6.4f)
                quadToRelative(dx1 = 4.79f, dy1 = 0.0f, dx2 = 4.79f, dy2 = 4.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.98f, y = 6.79f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 4.4f, dx2 = -4.04f, dy2 = 4.75f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.04f, dy1 = -0.75f)
                verticalLineToRelative(dy = -4.0f)
                quadTo(x1 = 17.98f, y1 = 6.0f, x2 = 13.19f, y2 = 6.0f)
                horizontalLineToRelative(dx = -6.4f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.04f)
                quadTo(x1 = 6.39f, y1 = 2.0f, x2 = 10.79f, y2 = 2.0f)
                horizontalLineToRelative(dx = 6.4f)
                quadToRelative(dx1 = 4.79f, dy1 = 0.0f, dx2 = 4.79f, dy2 = 4.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 13.5f, y = 13.25f)
                close()
                moveToRelative(dx = -3.5f, dy = 0.0f)
                close()
                moveToRelative(dx = -3.5f, dy = 0.0f)
                close()
            }
        }.build().also { _messagesOne = it }
    }

@Suppress("ObjectPropertyName")
private var _messagesOne: ImageVector? = null
